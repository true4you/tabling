package tabling.infra;
import tabling.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ReceptHateoasProcessor implements RepresentationModelProcessor<EntityModel<Recept>>  {

    @Override
    public EntityModel<Recept> process(EntityModel<Recept> model) {
        
        return model;
    }
    
}

