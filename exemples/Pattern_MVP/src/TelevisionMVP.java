import Model.TelevisionModel;
import Presenter.TelevisionPresenter;
import view.TelevisionView;

public class TelevisionMVP{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TelevisionModel modele = new TelevisionModel();
		TelevisionView vue = new TelevisionView();
		TelevisionPresenter presenter = new TelevisionPresenter();
		presenter.setModel(modele);
		presenter.setView(vue);
		vue.setPresenter(presenter);
	}
}
