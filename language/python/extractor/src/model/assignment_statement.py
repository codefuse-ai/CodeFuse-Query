# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class AssignmentStatement(Base):
    __tablename__ = "assignment_statement"

    element_oid = Column(Integer, primary_key=True)
    value_oid = Column(Integer, nullable=False)
    targets_size = Column(Integer, nullable=False)
