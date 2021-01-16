package com.example.demo.control;

import com.example.demo.bean.*;
import com.example.demo.service.CategoryService;
import com.example.demo.service.LabService;
import com.example.demo.service.SubjectInfoService;
import com.example.demo.service.SubjectService;
import com.example.demo.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class SubjectAction {
    @Autowired
    private SubjectService service;
    @Autowired
    private LabService LabService;
    @Autowired
    CategoryService CategoryService;
    @Autowired
    SubjectInfoService SubjectInfoService;
    private String currentCategory;
    private int currentCategoryIndex;
    private String currentLab;
    private  int currentLabIndex;
    private int currentPageIndex;
    private int firstPage=1;
    private int lastPage=6;
    private int  total;

    @GetMapping("/loadSubject")
    public String loadSubject(Model model, HttpServletRequest request){
       Subject subject= service.findByID("1");
        System.out.println(subject);
        Pager<Subject> pager=new Pager<>();
        List<Subject> list=new ArrayList<>();
        list.add(subject);
        pager.setRows(list);
        model.addAttribute("pager",pager);
        return "index";
    }

    @GetMapping("/search")
      public String searchSubject(Model model,HttpServletRequest request){
        String search= (String)request.getParameter("search");
        Pager<Subject> pagerS= service.findByPager(search,1,6);
        model.addAttribute("currentType"," ");
        model.addAttribute("Labs",this.getLabs());
        model.addAttribute("categorys",this.getCategorys());
        model.addAttribute("pager",pagerS);
        model.addAttribute("firstPage",this.firstPage);
        model.addAttribute("lastPage",this.lastPage);
        return "index";
      }



    @GetMapping("/pagePrevious")
    public String pagePrevious(Model model,HttpServletRequest request){


        if(this.firstPage!=1) {
            this.lastPage = this.firstPage - 1;
            this.firstPage = this.firstPage - 6;
        }
        Pager<Subject> pagerS= service.findByPager("标签",this.currentLab,"类别",this.currentCategory,this.currentPageIndex,6);


        model.addAttribute("currentCategory",this.currentCategory);
        model.addAttribute("currentCategoryIndex",this.currentCategoryIndex);
        model.addAttribute("currentLabIndex",this.currentLabIndex);
        model.addAttribute("currentLab",this.currentLab);
        model.addAttribute("Labs",this.getLabs());
        model.addAttribute("categorys",this.getCategorys());
        model.addAttribute("pager",pagerS);
        model.addAttribute("firstPage",this.firstPage);
        model.addAttribute("lastPage",this.lastPage);
        return "index";

    }

    @GetMapping("/pageNext")
    public String pageNext(Model model,HttpServletRequest request){
       this.total=service.total();
        if(this.firstPage+5<total) {
            this.firstPage = this.lastPage + 1;
            this.lastPage = this.firstPage + 5;
        }else {
            this.lastPage=this.total;
        }
        System.out.println("------------------>"+this.currentPageIndex);
        Pager<Subject> pagerS= service.findByPager("标签",this.currentLab,"类别",this.currentCategory,this.currentPageIndex,6);


        model.addAttribute("currentCategory",this.currentCategory);
        model.addAttribute("currentCategoryIndex",this.currentCategoryIndex);
        model.addAttribute("currentLabIndex",this.currentLabIndex);
        model.addAttribute("currentLab",this.currentLab);
        model.addAttribute("Labs",this.getLabs());
        model.addAttribute("categorys",this.getCategorys());
        model.addAttribute("pager",pagerS);
        model.addAttribute("firstPage",this.firstPage);
        model.addAttribute("lastPage",this.lastPage);
        return "index";

    }
    @GetMapping("/searchpage")
    public String searchPage(Model model,HttpServletRequest request){
        String pageIndex= (String)request.getParameter("page");
        this.currentPageIndex=Integer.parseInt(pageIndex);
        this.currentCategory="免费";
        Pager<Subject> pagerS= service.findByPager("类别",this.currentCategory,this.currentPageIndex,6);
//        model.addAttribute("currentCategory",this.currentCategory);
//        model.addAttribute("currentCategoryIndex",this.currentCategoryIndex);
//        model.addAttribute("currentLabIndex",this.currentLabIndex);
//        model.addAttribute("currentLab",this.currentLab);
        model.addAttribute("firstPage",this.firstPage);
        model.addAttribute("lastPage",this.lastPage);
        model.addAttribute("Labs",this.getLabs());
        model.addAttribute("categorys",this.getCategorys());
        model.addAttribute("pager",pagerS);
       model.addAttribute("currentPageIndex",this.currentPageIndex);
        return "index";
    }
    @GetMapping("/searchCategory")
    public String searchCategory(Model model,HttpServletRequest request){
        this.currentCategory= (String)request.getParameter("currentCategory");
        this.currentCategoryIndex=Integer.parseInt(request.getParameter("CategoryIndex"));

        Pager<Subject> pagerS= service.findByPager("类别",this.currentCategory,1,6);
        model.addAttribute("currentCategory",this.currentCategory);
        model.addAttribute("currentCategoryIndex",this.currentCategoryIndex);
        model.addAttribute("Labs",this.getLabs());
        model.addAttribute("categorys",this.getCategorys());
        model.addAttribute("pager",pagerS);
        model.addAttribute("firstPage",this.firstPage);
        model.addAttribute("lastPage",this.lastPage);
        return "index";
    }
    @GetMapping("/searchLab")
    public String searchLab(Model model,HttpServletRequest request){
       this.currentLab= (String)request.getParameter("currentLab");
       this.currentLabIndex=Integer.parseInt(request.getParameter("labIndex"));

        Pager<Subject> pagerS= service.findByPager("标签",this.currentLab,"类别",this.currentCategory,1,6);


        model.addAttribute("currentCategory",this.currentCategory);
        model.addAttribute("currentCategoryIndex",this.currentCategoryIndex);
        model.addAttribute("currentLabIndex",this.currentLabIndex);
        model.addAttribute("currentLab",this.currentLab);

        model.addAttribute("Labs",this.getLabs());
        model.addAttribute("categorys",this.getCategorys());
        model.addAttribute("pager",pagerS);
        model.addAttribute("firstPage",this.firstPage);
        model.addAttribute("lastPage",this.lastPage);
        return "index";
    }
     public List<Lab> getLabs(){
        return LabService.labList();
     }
     public List<Category> getCategorys(){
        return CategoryService.labList();
     }
}
