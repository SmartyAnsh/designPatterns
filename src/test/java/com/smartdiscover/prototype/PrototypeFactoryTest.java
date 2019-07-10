package com.smartdiscover.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeFactoryTest {

    @Test
    public void prototypeTest() {

        try
        {
            Person userClone = PrototypeFactory.getInstance(PrototypeFactory.PersonType.USER);

            System.out.println(userClone.toString());

            Assert.assertEquals( userClone.toString(), "Person Object with type : USER");

            Person employeeClone = PrototypeFactory.getInstance(PrototypeFactory.PersonType.EMPLOYEE);

            System.out.println(employeeClone.toString());

            Assert.assertEquals( employeeClone.toString(), "Person Object with type : EMPLOYEE");

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }



    }

}
