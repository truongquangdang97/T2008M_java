package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    int[] RateList = new int[3];


    @Override
    public void Display() {
        System.out.println(getTitle()+getPublishDate()+getAuthor()+getContent()+getAverageRate());
    }
    public void Calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 3 gia tri :");
        for (int i =0 ;i<RateList.length;i++){
            RateList[i]=sc.nextInt();
        }
        for (int i=0;i<RateList.length;i++){
            AverageRate+=RateList[i];
        }
        setAverageRate(AverageRate/RateList.length);

        System.out.println("AverageRate có giá trị là"+ getAverageRate());
    }


    public News() {
    }

    public News(String title, String publishDate, String author, String content, float averageRate) {
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setAverageRate(float averageRate) {
        AverageRate = averageRate;
    }
    // Title (String), PublishDate (String), Author (String), Content (String) và AverageRate (float)

//
}
