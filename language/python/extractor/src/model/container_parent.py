# coding: utf-8
from sqlalchemy import Column, Integer
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
metadata = Base.metadata


class ContainerParent(Base):
    __tablename__ = "container_parent"

    child_oid = Column(Integer, primary_key=True)
    parent_oid = Column(Integer, nullable=False)
