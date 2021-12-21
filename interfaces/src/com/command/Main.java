package com.command;

public class Main {

    public static void main(String[] args) {

       /* ICustomerDal customerDal = new MySqlCustomerDal();
        IRepository repository = new MySqlCustomerDal();


        ICustomerDal customerDal1 = new OracleCustomerDal();

        customerDal.Add();
        customerDal1.Add();
        repository.Update();*/

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

    }
}
