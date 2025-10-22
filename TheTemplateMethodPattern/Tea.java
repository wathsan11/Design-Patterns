

//  public class Tea {
 
//     void prepareRecipe() {
//         boilWater();
//         steepTeaBag();
//         pourInCup();
//         addLemon();
//     }
 
//     public void boilWater() {
//         System.out.println("Boiling Water");
//     }
 
//     public void steepTeaBag() {
//         System.out.println("Steeping the tea");
//     }
 
//     public void addLemon() {
//         System.out.println("Adding Lemon");
//     }
 
//     public void pourInCup() {
//         System.out.println("Pouring into cup");
//     }
//  }



 public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
 }