package jp.ac.titech.cs.se.fwit.core.model.req.action;

public class LiteralAction extends NameAction {
	
	enum Type {STRING, NUMBER, BOOLEAN, NULL};
	
	public LiteralAction(String label, String type) {
		this.type = type;
		this.label = label;
	}
}
