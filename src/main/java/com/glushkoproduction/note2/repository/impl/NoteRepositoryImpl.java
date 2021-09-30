package com.glushkoproduction.note2.repository.impl;

import com.glushkoproduction.note2.entity.NoteRecord;
import com.glushkoproduction.note2.repository.NoteRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class NoteRepositoryImpl implements NoteRepository {
//    @PersistenceContext
    private final EntityManager em;

    public NoteRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<NoteRecord> myAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<NoteRecord> criteria = cb.createQuery(NoteRecord.class);
        Root<NoteRecord> root = criteria.from(NoteRecord.class);
        criteria.select(root).where();
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<NoteRecord> myFindById(long id) {
        List<Predicate> predicates = new ArrayList<>();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<NoteRecord> criteria = cb.createQuery(NoteRecord.class);
        Root<NoteRecord> root = criteria.from(NoteRecord.class);

        predicates.add(cb.equal(root.get("id"), id));

        Predicate[] arr = new Predicate[predicates.size()];
        predicates.toArray(arr);
        criteria.select(root).where(arr);

        return em.createQuery(criteria).getResultList();
    }

    @Override
    public void myAdd(NoteRecord nr) {
        em.persist(nr);
    }

}
