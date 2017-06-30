package CodeWars;


public class AgeDiff {

        public String CalculateAge(int birth, int yearTo)
        {
            // TODO: your code here
            int i = yearTo - birth;
            int i2 = birth - yearTo;

            String nomber = String.valueOf(i);
            String nomber2 = String.valueOf(i2);

            String thisYear = "You were born this very year!";
            String oneYear = "You are " + nomber + " year old.";
            String years = "You are " + nomber + " years old.";

            String willOneYear = "You will be born in "+ nomber2 +" year.";
            String willYears = "You will be born in " + nomber2 + " years.";

            if(i == 0){

                return thisYear ;

            } else if(i == 1){

                return  oneYear;

            } else if(i > 1){

                return  years;

            }else if(i2 > 1){

                return  willYears;
            }
            return willOneYear;
        }

}

