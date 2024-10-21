package br.com.fullcycle.hexagonal.application.usecases;

public abstract class UseCase<INPUT, OUTPUT> {

    public abstract OUTPUT execute(INPUT input);
}