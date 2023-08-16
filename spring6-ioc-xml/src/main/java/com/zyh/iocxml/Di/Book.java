package com.zyh.iocxml.Di;

public class Book {

    private String bname;
    private String author;
    private String others;

    //create set function


    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //


    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set
        Book book = new Book();
        book.setBname("ZyhSpring");
        book.setAuthor("zyh");

        //
        Book book2 = new Book("ZYhs","zyh");

    }

}
