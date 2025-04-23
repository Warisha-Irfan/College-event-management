package com.collegeevent.KajalK11.College_event_management.repository;

import com.collegeevent.KajalK11.College_event_management.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface UserImple extends  JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);

    /**
     *
     */
    @Override
    public void flush() {

    }

    /**
     * @param entity
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    /**
     * @param entities
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    /**
     * @param entities
     */
    @Override
    public void deleteAllInBatch(Iterable<User> entities) {

    }

    /**
     * @param longs
     */
    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    /**
     *
     */
    @Override
    public void deleteAllInBatch() {

    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public User getOne(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public User getById(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public User getReferenceById(Long aLong) {
        return null;
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return List.of();
    }

    /**
     * @param example
     * @param sort
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    /**
     * @param example
     * @param pageable
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    /**
     * @param example
     * @param queryFunction
     * @param <S>
     * @param <R>
     * @return
     */
    @Override
    public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    /**
     * @param entity
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    /**
     * @param entities
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public List<User> findAll() {
        return List.of();
    }

    /**
     * @param longs
     * @return
     */
    @Override
    public List<User> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    /**
     * @return
     */
    @Override
    public long count() {
        return 0;
    }

    /**
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {

    }

    /**
     * @param entity
     */
    @Override
    public void delete(User entity) {

    }

    /**
     * @param longs
     */
    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    /**
     * @param entities
     */
    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    /**
     *
     */
    @Override
    public void deleteAll() {

    }

    /**
     * @param sort
     * @return
     */
    @Override
    public List<User> findAll(Sort sort) {
        return List.of();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }
}
