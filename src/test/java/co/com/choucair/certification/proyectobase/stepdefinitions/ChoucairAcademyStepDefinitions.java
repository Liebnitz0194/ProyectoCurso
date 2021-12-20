package co.com.choucair.certification.proyectobase.stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
      OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
       /* OnStage.theActorCalled("Brandon").
        OnStage.theActorCalled("Brandon").wasAbleTo(Go.toGooglePage());
        OnStage.theActorCalled("Brandon").wasAbleTo(Launch.youtubeHomepage());
        OnStage.theActorCalled("Brandon").wasAbleTo(Search.yourFavoriteSong());
        OnStage.theActorCalled("Brandon").wasAbleTo(Login.withCredential(username, password));*/
       OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds course called resources (.*)$")
    public void heFindsCourseCalledResourcesRecursosAutomatizaciónBancolombia(String question) {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
