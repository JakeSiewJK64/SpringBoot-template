package com.fategrandorder.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import com.fategrandorder.model.Book;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class BookController implements IBookController {
    public List<Book> FindAllBooks() {
        List<Book> returnVar = new ArrayList<Book>();
        returnVar.add(new Book());
        return returnVar;
    }

    @Override
    public List<Book> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Book> findAll(Sort arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> List<S> findAll(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> List<S> findAll(Example<S> arg0, Sort arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> S insert(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> List<S> insert(Iterable<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> List<S> saveAll(Iterable<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Book> findAll(Pageable arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Book arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll(Iterable<? extends Book> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllById(Iterable<? extends String> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteById(String arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean existsById(String arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Book> findAllById(Iterable<String> arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Book> findById(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> S save(S arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> long count(Example<S> arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Book> boolean exists(Example<S> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Book> Page<S> findAll(Example<S> arg0, Pageable arg1) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> Optional<S> findOne(Example<S> arg0) {
        // TODO Auto-generated method stub
        return null;
    }
}
