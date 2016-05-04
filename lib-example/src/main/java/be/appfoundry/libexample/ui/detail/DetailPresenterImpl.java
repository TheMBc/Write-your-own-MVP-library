package be.appfoundry.libexample.ui.detail;

import be.appfoundry.libexample.lib.BasePresenter;
import be.appfoundry.libexample.service.DataService;
import be.appfoundry.libexample.service.ServiceFactory;

public class DetailPresenterImpl extends BasePresenter<DetailMVPContract.DetailView>
    implements DetailMVPContract.DetailPresenter {

    private final DataService dataService;

    DetailPresenterImpl() {
        dataService = ServiceFactory.provideDataService();
    }

    @Override
    public void getDetailData() {
        if (isViewAttached()) {
            view.showData(dataService.getDetailObject());
        }
    }
}
