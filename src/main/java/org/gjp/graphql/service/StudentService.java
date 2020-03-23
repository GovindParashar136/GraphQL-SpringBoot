package org.gjp.graphql.service;

import org.gjp.graphql.modal.Student;

public interface StudentService
{
    public Student getStudentDetailsByName(String name);

    public Student createStudentRecord(Student student);
}
