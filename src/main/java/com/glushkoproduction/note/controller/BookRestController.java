package com.glushkoproduction.note.controller;

import com.glushkoproduction.note.Service.BookService;
import com.glushkoproduction.note.dto.ModelListBook;
import com.glushkoproduction.note.dto.RequestForFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController {
    private BookService bookService;

    @Autowired
    public void setNoteService(BookService bookService) {
        this.bookService = bookService;
    }

    // Ajax POST запрос
    @PostMapping("/jsontest")
    public List<ModelListBook> jsonTest() {
        return bookService.findAll();
    }

    // Ajax POST запрос
    @PostMapping("/formTestAttr")
    public String formTestAttr(RequestForFormDTO request) {
        System.out.println(request.getNum());
        System.out.println(request.getYear());
        System.out.println(request.getName());

        return "OK";
    }


//    @PostMapping("/jsonTestAttr/{num}")
//    public String jsonTestAttr(@PathVariable String num, Model model) {
//        model.addAttribute("get", 1);
//        return "index";
//    }


//    @GetMapping("/")
//    public ModelAndView testjs(ModelAndView modelAndView) {
//        modelAndView.setViewName("testjs");
//        return modelAndView;
//    }
//
//    @GetMapping("/all")
//    public ModelAndView list(ModelAndView modelAndView) {
//        List<ModelListNote> noteList = noteService.myAll();
//        modelAndView.addObject("notes", noteList);
//        List<ModelListBook> bookList = bookService.findAll();
//        modelAndView.addObject("books", bookList);
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
//
//    @GetMapping("/all/{id}")
//    public String edit(@PathVariable Integer id, Model model) {
//        Book book = bookService.getById((long) id);
//        model.addAttribute("book", book);
//        return "index";
//    }
//
//    // Ajax GET запрос
//    @GetMapping("/gettest")
//    public String getTest(String id_product, String qty_product) {
//        System.out.println("gettest=" + id_product + ", " + qty_product);//gettest=111, 222
//        return "index";
//    }
//
//    // Ajax POST запрос
//    @PostMapping("/posttest")
//    public String postTest(String text, String twoparametr) {
//        System.out.println("posttest=" + text + ", " + twoparametr);//posttest=321, 456
//        return "index";
//    }

//    private String sortDateMethod = "ASC";

//    @GetMapping("/one")
//    public String list(Model model) {
//        List<Note> notebook = service.findById(1);
//        model.addAttribute("notes", notebook);
//        return "index";
//    }

//    @GetMapping("/new")
//    public String newNote() {
//        return "operations/new";
//    }
//
//    @PostMapping("/save")
//    public String updateNote(@RequestParam String message) {
//        service.saveNote(new Note(message));
//        return "redirect:/";
//    }
//

//
//    @PostMapping("/update")
//    public String saveNote(@RequestParam Integer id, @RequestParam String message,
//                           @RequestParam(value = "done", required = false) boolean done) {
//        service.updateNote(id, message, done);
//        return "redirect:/";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Integer id) {
//        service.deleteNote(id);
//        return "redirect:/";
//    }
//
//    private List<Note> filterAndSort() {
//        List<Note> notebook = null;
//        switch (sortDateMethod) {
//            case "ASC":
//                notebook = service.findAllByOrderByDateAsc();
//                break;
//            case "DESC":
//                notebook = service.findAllByOrderByDateDesc();
//                break;
//        }
//        return notebook;
//    }
}
