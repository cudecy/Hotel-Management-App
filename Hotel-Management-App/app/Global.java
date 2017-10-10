import controllers.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.F;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;

public class Global extends GlobalSettings {

    @Override
    public void onStart(play.Application application) {
        super.onStart(application);
        Logger.info("Application has been shutdown but is now started");
    }


    public void onStop(Application app) {
        Logger.info("Application shutdown...");
    }

    @Override
    public F.Promise<Result> onHandlerNotFound(Http.RequestHeader requestHeader) {

        String requestUrl = requestHeader.path();

        play.Logger.debug("in handler , url {}", requestUrl);


        if (requestUrl.endsWith("/")) {
            play.Logger.debug("requrl endswith {}", requestUrl.endsWith("/"));

            play.Logger.debug("requrl new url {}", (requestUrl.substring(0, requestUrl.length() - 1)));


            return F.Promise.<Result>pure(Action.redirect(requestUrl.substring(0, requestUrl.length() - 1)));
        }
        return F.Promise.<Result>pure(Results.notFound(views.html.exceptions.notFound.render(requestHeader.uri())));
    }



    @Override
    public F.Promise<Result> onBadRequest(Http.RequestHeader requestHeader, String s) {
        play.Logger.debug("unknown {}", s);
        play.Logger.debug("{}", requestHeader.toString());
        play.Logger.debug("{}", requestHeader.headers().toString());

        super.onBadRequest(requestHeader, s);

        return F.Promise.<Result>pure(Results.notFound(views.html.exceptions.notFound.render(requestHeader.uri())));
    }


}