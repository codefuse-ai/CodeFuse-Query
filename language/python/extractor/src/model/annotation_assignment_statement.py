# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AnnotationAssignmentStatement(Base):
    __tablename__ = "annotation_assignment_statement"

    element_oid = Column(Integer, primary_key=True)
    annotation_oid = Column(Integer, nullable=False)
    target_oid = Column(Integer, nullable=False)
    is_simple = Column(Integer, nullable=False)
