package nextstep.cucumber.steps;

import io.cucumber.java8.En;
import nextstep.utils.DataLoader;
import nextstep.utils.DatabaseCleanUp;
import org.springframework.beans.factory.annotation.Autowired;

public class BeforeStepDef implements En {

    @Autowired
    private DatabaseCleanUp databaseCleanUp;

    @Autowired
    private DataLoader dataLoader;

    public BeforeStepDef() {
        Before(() -> {
            databaseCleanUp.execute();
            dataLoader.loadData();
        });
    }
}
