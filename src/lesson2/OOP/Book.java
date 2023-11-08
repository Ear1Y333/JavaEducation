package lesson2.OOP;

public class Book {
    String Name1;
    String Name2;
    int Number;
    boolean documentation;

    public Book (String NameOfBook, String NameOfWriter, int NumberOfPages, boolean Documentation){
        this.Name1 = NameOfBook;
        this.Name2 = NameOfWriter;
        this.Number = NumberOfPages;
        this.documentation = Documentation;
    }

    void NumberOfStr(int Number){
        System.out.printf("Кол-во строк в книге: %d\n", Number*40);
    }
    void GetAllInformation(){
        System.out.printf("Name of book: %s, name of writer: %s, number of pages: %d, documentation: %s", Name1, Name2, Number, documentation? "Есть": "Нету");
    }
}
