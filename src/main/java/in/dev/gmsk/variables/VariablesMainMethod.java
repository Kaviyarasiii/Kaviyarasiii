package in.dev.gmsk.variables;

import java.io.PrintStream;

import static java.lang.System.out;

public class VariablesMainMethod {

    // Global variables it`s contains static and not static variables
    private static final String brandName = "ASUS";
    private static final String brandAddress = "Bangalore";
    long branchMangerMobileNo = 9638527410L; // non-static variable another names of instance variable

    public static void main(String[] args) {
        localVariableExample();
    }

    public static void localVariableExample() {
        // branchMangerMobileNo = 9874125630L; // error can not reference from a static context
        // brandAddress = "Hyderabad"; // error can`t assign the value final variables
        // static String brandAddress = "Hyderabad"; // error modifier static not allow to declare. Inside method can`t declare the static var

        long branchLocalLanLineNum = 1379989898L; // local variable

        // System.out.printf("Brand Name : %s%nBrand Address : %s%nBranch Manger MobileNo : %s%n", brandName, brandAddress, branchMangerMobileNo); // return type is PrintStream, error because branchMangerMobileNo is not static variable.

        printAllGlobalVariables();
        out.println("branchLocalLanLineNum : " + branchLocalLanLineNum); // return type void, Inside SCP create two object.
    }

    public static PrintStream printAllGlobalVariables() { // Return value of the method is never used possible to come warning just ignore it.
        return out.printf("Brand Name : %s%nBrand Address : %s%nBranch Manger MobileNo : %s%n", brandName, brandAddress, new VariablesMainMethod().branchMangerMobileNo); // return type is PrintStream
    }
}
