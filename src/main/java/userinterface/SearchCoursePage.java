package userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC =Target.the("Selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE =Target.the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO =Target.the("Da click para buscar el curso").located(By.id("//button[@class='btn btn-secon dary']"));
    public static final Target SELECT_COURSE =Target.the("Da click para buscar el curso").located(By.xpath("//h4[contains(text() 'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE =Target.the("Buscar el curso").located(By.id("coursesearchbox"));
}
