package co.com.senasoft.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_MAN_CATEGORY = Target.the("its used to navigate to the t-shirts category")
            .locatedBy("//a[@id='st_ma_67']");
    public static final Target FIRST = Target.the("FIRS used to navigate to the t-shirts category")
            .locatedBy("//li[@id='st_menu_2']");

    public static final Target BTN_SIZE_OPTION = Target.the("its used to select a size")
            .locatedBy("//li[@data-id_product ='43576']/div/div/div/div/div/div/ul/li[2]/span");
    public static final Target BTN_SIZE = Target.the("its used to select ")
            .locatedBy("//li[@data-id_product ='43576']//i[@class='fas fa-triangle']");
    public static final Target BTN_ADD= Target.the("its used to add")
            .locatedBy("//li[@data-id_product ='43576']//div[@class='add_to_cart__wrapper']");
}
