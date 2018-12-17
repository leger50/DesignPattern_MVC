import controller.TelevisionController;
import model.TelevisionModel;
import view.TelevisionView;

public class TelevisionMVC {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		TelevisionModel model = new TelevisionModel();
		TelevisionController controller = new TelevisionController(model);
		TelevisionView view = new TelevisionView(model, controller);
	}
}
