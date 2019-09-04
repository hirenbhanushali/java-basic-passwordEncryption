import java.util.*;

class encrypt1{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String string;

		System.out.println("Enter a lowercase easy PASSWORD");
		
		string = sc.nextLine();

		char[] str = string.toCharArray();

		String pass = string;

		int n = string.length();
        
		for(int i=0;i<n;i++){
			if(str[i] == 'a'){
				str[i] = 'j';
			}
			else if (str[i] == 'b'){
				str[i] = 'k';
			}
			else if (str[i] == 'c'){
				str[i] = 'l';
			}
			else if (str[i] == 'd'){
				str[i] = 'm';
			}
			else if (str[i] == 'e'){
				str[i] = 'n';
			}
			else if (str[i] == 'f'){
				str[i] = 'o';
			}
			else if (str[i] == 'g'){
				str[i] = 'p';
			}
			else if (str[i] == 'h'){
				str[i] = 'q';
			}
			else if (str[i] == 'i'){
				str[i] = 'r';
			}
			else if (str[i] == 'j'){
				str[i] = '@';
			}
			else if (str[i] == 'k'){
				str[i] = 'a';
			}
			else if (str[i] == 'l'){
				str[i] = 'b';
			}
			else if (str[i] == 'm'){
				str[i] = '#';
			}
			else if (str[i] == 'n'){
				str[i] = 'c';
			}
			else if (str[i] == 'o'){
				str[i] = 'd';
			}
			else if (str[i] == 'p'){
				str[i] = 'e';
			}
			else if (str[i] == 'q'){
				str[i] = 'f';
			}
			else if (str[i] == 'r'){
				str[i] = '!';
			}
			else if (str[i] == 's'){
				str[i] = 'w';
			}
			else if (str[i] == 't'){
				str[i] = 'x';
			}
			else if (str[i] == 'u'){
				str[i] = 'y';
			}
			else if (str[i] == 'v'){
				str[i] = 'z';
			}
			else if (str[i] == 'w'){
				str[i] = 'g';
			}
			else if (str[i] == 'x'){
				str[i] = 's';
			}
			else if (str[i] == 'y'){
				str[i] = 't';
			}
			else if (str[i] == 'z'){
				str[i] = 'u';
			}
		}
        
        char[] passw = new char[n+4];
        
        passw[0] = 'Z';
        
        passw[1] = '3';
        
        passw[2] = '^';
        
        passw[3] = '0';
        
        for(int j=0;j<n;j++){
            passw[j+4] = str[j];
        }

		string = String.valueOf(passw);

		System.out.println("Your PASSWORD is " + pass);

		System.out.println("Your PASSWORD length is " + n);
		
		System.out.println("Your ENCRYPTED PASSWORD is " + string);

	}
}
