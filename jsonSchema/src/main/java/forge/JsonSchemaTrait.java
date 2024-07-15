package forge;


import software.amazon.smithy.model.node.Node;
import software.amazon.smithy.model.node.ObjectNode;
import software.amazon.smithy.model.shapes.ShapeId;
import software.amazon.smithy.model.traits.AnnotationTrait;

public class JsonSchemaTrait extends AnnotationTrait {
    public static final ShapeId ID = ShapeId.from("czr#jsonSchema");
    public JsonSchemaTrait(ObjectNode node) {
        super(ID, node);
    }

    public JsonSchemaTrait() {
        this(Node.objectNode());
    }

    public static final class Provider extends AnnotationTrait.Provider<JsonSchemaTrait> {
        public Provider() {
            super(ID, JsonSchemaTrait::new);
        }
    }
}
