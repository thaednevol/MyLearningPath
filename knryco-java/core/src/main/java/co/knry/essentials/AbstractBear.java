package co.knry.essentials;

public sealed interface AbstractBear {
}

sealed interface InterfacedBear extends AbstractBear {

}

final class ImplementedBear implements InterfacedBear {

}

sealed class SealedClassWithNested {
    class NestedClass {

    }
}

final class SonOfSealedClassWithNested extends SealedClassWithNested {

}




