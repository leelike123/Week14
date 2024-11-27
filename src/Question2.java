import java.io.File;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 입력해주세요 : ");
        String filePath = sc.nextLine();

        File file = new File(filePath);
        System.out.print(file.getName());
        System.out.print(file.getAbsolutePath());
        System.out.print(file.length()+ " bytes");
    }
}
