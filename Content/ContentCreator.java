public class ContentCreator {
    String youtuber; 
    int viewers; 
    double income; 

    public ContentCreator(String youtuber) {
        this.youtuber = youtuber; 
    }

    public void viewership(int viewership) {
        viewers =  viewership; 
    }

    public void money(double money) {
        income = money; 
    }

    public void printCreator() {
        System.out.println("Name of content creator: " + youtuber);
        System.out.println("Number of views: " + viewers);
        System.out.println("Amount of finances: " + income);
    }
    
}
