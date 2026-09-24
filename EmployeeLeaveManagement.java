import java.util.Scanner;

public class EmployeeLeaveManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] employees = new String[10];
        int[] leaveBalance = new int[10];

        int employeeCount = 0;

        while (true) {

            System.out.println("\n--- Employee Leave Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Apply Leave");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (employeeCount < 10) {

                        System.out.print("Enter employee name: ");
                        employees[employeeCount] = sc.nextLine();

                        leaveBalance[employeeCount] = 20;

                        employeeCount++;

                        System.out.println("Employee added successfully!");
                        System.out.println("Leave Balance: 20 days");

                    } else {
                        System.out.println("Employee list is full!");
                    }

                    break;

                case 2:

                    if (employeeCount == 0) {

                        System.out.println("No employees available.");

                    } else {

                        System.out.println("\n--- Employee Details ---");

                        for (int i = 0; i < employeeCount; i++) {

                            System.out.println(
                                (i + 1) + ". " +
                                employees[i] +
                                " - Leave Balance: " +
                                leaveBalance[i] +
                                " days"
                            );
                        }
                    }

                    break;

                case 3:

                    if (employeeCount == 0) {

                        System.out.println("No employees available.");

                    } else {

                        System.out.println("\n--- Employees ---");

                        for (int i = 0; i < employeeCount; i++) {
                            System.out.println(
                                (i + 1) + ". " + employees[i]
                            );
                        }

                        System.out.print("Select employee number: ");
                        int employee = sc.nextInt();

                        if (employee >= 1 && employee <= employeeCount) {

                            System.out.print("Enter number of leave days: ");
                            int days = sc.nextInt();

                            if (days <= leaveBalance[employee - 1]) {

                                leaveBalance[employee - 1] =
                                    leaveBalance[employee - 1] - days;

                                System.out.println("Leave applied successfully!");
                                System.out.println(
                                    "Remaining Leave: " +
                                    leaveBalance[employee - 1] +
                                    " days"
                                );

                            } else {

                                System.out.println(
                                    "Insufficient leave balance!"
                                );
                            }

                        } else {

                            System.out.println("Invalid employee number!");
                        }
                    }

                    break;

                case 4:

                    System.out.println(
                        "Thank you for using Employee Leave Management System!"
                    );

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}
