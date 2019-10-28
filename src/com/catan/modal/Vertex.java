package com.catan.modal;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Vertex {

    private Circle shape;
    private ArrayList<Vertex> neighbors;

    public Vertex(Circle shape) {
        neighbors = new ArrayList<>();
        this.shape = shape;
    }

    public ArrayList<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public Circle getShape() {
        return shape;
    }

    public void setShape(Circle shape) {
        this.shape = shape;
    }

    public void addNeighbor(Vertex vertex) {
        neighbors.add(vertex);
    }

}